create database Raimb;
use Raimb;

create table Rol
(
CodRol  int auto_increment primary key not null,
TipoRol varchar (25) not null
);

create table TipoDocumento
(
IdTipo integer auto_increment primary key not null,
Clase_Documento varchar (25) not null
);


create table EstadoAprendiz
(
IdEstado int auto_increment primary key not null,
Tipo_Estado varchar (25) not null
);

create table Especialidad
(
IdEspecialidad int auto_increment primary key not null,
Nombre_Especialidad varchar (55) not null
);

create table Programa
(
IdPrograma integer not null,
Nombre_Programa varchar (55) not null,
IdEspecilidad_Programa int not null
);

alter table Programa add unique (IdPrograma);
alter table Programa add primary key (IdEspecilidad_Programa,IdPrograma);
alter table Programa add constraint fk_Especialidad_Programa foreign key (IdEspecilidad_Programa) references Especialidad(IdEspecialidad);
alter table programa modify IdPrograma integer not null auto_increment;

create table Ficha
(
IdFicha integer not null,
Numero_Ficha varchar (45) not null,
IdPrograma_Ficha int not null
);
alter table Ficha add unique (IdFicha);
alter table Ficha add primary key (IdPrograma_Ficha,IdFicha);
alter table Ficha add constraint Fk_Programa_Ficha foreign key (IdPrograma_Ficha) references Programa(IdPrograma);
alter table Ficha modify IdFicha integer not null auto_increment;

create table Usuario
(
IdNumeIden char (12) not null,
Primer_Nombre varchar (55) not null,
Segundo_Nombre varchar (55) null,
Primer_Apellido varchar (55) not null,
Segundo_Apellido varchar (55) null,
NumTelefonico bigint not null,
Correo_Electronica varchar (255) unique not null,
UserName varchar (55) null,
Contraseña varchar(55) null, 
CodRol_Usuario int not null,
IdEstado_Usuario int not null,
IdTipoDc_Usuario int not null,
IdFicha_Usuario int not null,
foreign key (IdEstado_Usuario) references EstadoAprendiz(IdEstado),
foreign key (IdFicha_Usuario) references Ficha(IdFicha)
);
alter table Usuario add unique (IdNumeIden);
/*select * from Usuario;
drop table Usuario;*/

alter table Usuario add primary key (IdNumeIden,CodRol_Usuario,IdTipoDc_Usuario);
alter table Usuario add constraint Fk_Rol_Usuario foreign key (CodRol_Usuario) references Rol (CodRol);
alter table Usuario add constraint Fk_TD_Usuario foreign key (IdTipoDc_Usuario) references TipoDocumento (IdTipo);

create table Nota
(
Id_Nota int auto_increment primary key not null,
Comentario varchar (255) not null,
IdNumeIden_Nota char (12) not null,
foreign key (IdNumeIden_Nota) references Usuario (IdNumeIden)
);

create table ClaseVehiculo
(
IdClase integer auto_increment primary key not null,
Tipo_Vehiculo varchar (55) not null
);

create table Modelo
(
IdModelo int auto_increment primary key not null,
Ano_Modelo varchar (55) not null
);

create table Marca
(
IdMarca int auto_increment primary key not null,
Nombre_Marca varchar (55) not null
);

create table Vehiculo
(
IdVehiculo varchar (12) not null,
ColorVehiculo varchar (55) not null,
IdNumeIden_Vehiculo char (12) not null,
IdClase_Vehiculo int not null,
IdModelo_Vehiculo int not null,
IdMarca_Vehiculo int not null
);

alter table Vehiculo add primary key  (IdVehiculo,IdNumeIden_Vehiculo,IdClase_Vehiculo,IdModelo_Vehiculo,IdMarca_Vehiculo);
alter table Vehiculo add constraint Fk_Vehiculo_Usuario foreign key (IdNumeIden_Vehiculo) references Usuario (IdNumeIden);
alter table Vehiculo add constraint Fk_Vehiculo_Clase foreign key (IdClase_Vehiculo) references ClaseVehiculo (IdClase);
alter table Vehiculo add constraint Fk_Vehiculo_Modelo foreign key (IdModelo_Vehiculo) references Modelo (IdModelo);
alter table Vehiculo add constraint Fk_Vehiculo_Marca foreign key (IdMarca_Vehiculo) references Marca (IdMarca);
alter table Vehiculo add unique (IdVehiculo);

create table conteoparqueadero
 (
 Idlugarparqueadero int auto_increment primary key not null,
 IdVehiculo_Cp char (12) not null
 /*Foreign key (IdVehiculo_Cp) references Vehiculo (IdVehiculo)*/
 );
 

create table Bahia
(
Id_Bahia Varchar (55) primary key not null,
Cnatidad_Bahias int not null,
Numerador_Bahias int not null
);

 create table Cupo
(
Id_Cupo int not null,
Estado bit,
Id_Bahia_Cupo varchar (55) not null
);

alter table Cupo add primary key (Id_Cupo,Id_Bahia_Cupo);
alter table Cupo add constraint Fk_Bahia_Cupo foreign key (Id_Bahia_Cupo) references Bahia(Id_Bahia);
alter table Cupo add unique (Id_Cupo);
 
create table Registro
(
IdRegistro int not null,
Fecha_Hora_Ingreso datetime not null,
Fecha_Hora_Salida datetime not null,
Id_Cupo_Registro int not null
);

alter table Registro add primary key (IdRegistro,Id_Cupo_Registro);
alter table Registro add constraint Fk_Registro_Cupo foreign key (Id_Cupo_Registro) references Cupo (Id_Cupo);
alter table Registro modify IdRegistro int not null auto_increment ;
alter table Registro add unique (IdRegistro);

create table Vehiculo_Registro 
(
IdVehiculo_Registro varchar(12) not null,
IdRegistro_Registro int not null
);

alter table Vehiculo_Registro add unique (IdVehiculo_Registro);
alter table Vehiculo_Registro add primary key (IdVehiculo_Registro,IdRegistro_Registro);
alter table Vehiculo_Registro add constraint Fk_Vehiculo_Registro_vehivulo foreign key (IdVehiculo_Registro) references Vehiculo (IdVehiculo);
alter table Vehiculo_Registro add constraint Fk_Registro_Vehiculo foreign key (IdRegistro_Registro) references Registro (IdRegistro);

create table ServidorCorreo
(
IdServidor int auto_increment primary  key not null,
Recupearcion_de_Contraseña varchar (60) not null,
Corfimar_Cuenta varchar(60) not null,
Cambiar_Comtraseña varchar (60) not null
);

Create table LogError
(
Iderror int auto_increment primary key not null,
Codigo_error varchar (255) not null,
Hora_y_Fecha_Error datetime not null
);

