package br.unibh.seguros.entidades;

import javax.persistence.GenerationType;

public @interface GeneratdValue {

	GenerationType strategy();

}
