<?php
require ('Conexion.php');

$nombre = stripcslashes($_REQUEST['Nombre']);
$nombre = mysqli_real_escape_string($connect, $nombre);
$autorn = stripcslashes($_REQUEST['nombre']);
$autorn = mysqli_real_escape_string($connect, $autorn);
$autora = stripcslashes($_REQUEST['Apelllido']);
$autora = mysqli_real_escape_string($connect, $autora);
$descripcion = stripcslashes($_REQUEST['Descripcion']);
$descripcion = mysqli_real_escape_string($connect, $descripcion);
$copias = stripcslashes($_REQUEST['Copias']);
$copias = mysqli_real_escape_string($connect, $copias);

$query = "select * from usuario;";

echo "{
  \"Nombre\": \"$nombre\",
  \"Autor\": \"$autorn\",
  \"AutorA\": \"$autora\",
  \"Descripcion\": \"$descripcion\",
  \"Copias\": \"$copias\",
}";

?>