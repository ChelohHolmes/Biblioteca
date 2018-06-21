<?php
require('Conexion.php');

$usuario = stripcslashes($_REQUEST['usuario']);
$usuario = mysqli_real_escape_string($connect, $usuario);
$contrasenia = stripcslashes($_REQUEST['contrasenia']);
$contrasenia = mysqli_real_escape_string($connect, $contrasenia);

$query = "SELECT * FROM 'usuario' WHERE clave = '$usuario'
and contraseña = '".md5($contrasenia)."'";

$resultado = mysqli_query($connect, $query) or die (mysqli_error());

if (mysqli_num_rows($resultado) > 0)
    echo"{\"Estado\": correcto }";
else
    echo"{\"Estado\": incorrecto }";

?>