<?php
require ('Conexion.php');

$nombre = stripcslashes($_REQUEST['usuario']);
$nombre = mysqli_real_escape_string($connect, $usuario);
$telefono = stripcslashes(($_REQUEST['telefono']));
$telefono = mysqli_real_escape_string($connect, $telefono);
$contrasenia = stripcslashes($_REQUEST['contrasenia']);
$contrasenia = mysqli_real_escape_string($connect, $contrasenia);

$contar = mysqli_query($connect, "SELECT * from usuario");
$n = mysqli_num_rows($contar);
$n++;
$query = "INSERT into 'usuario' (Clave, Nombre, Contraseña, Tipo, Telefono)
VALUES ('$n', '$nombre', '".md5($contrasenia)."', 'Usuario', '$telefono')";

$resultado = mysqli_query($connect, $query) or die (mysqli_error());
if($resultado)
    echo"{\"Estado\": correcto }";
else
    echo"{\"Estado\": incorrecto }";

?>