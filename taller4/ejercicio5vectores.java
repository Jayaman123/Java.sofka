
 import java.io.*;
public class ejercicio5vectores {
   

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int columna;
		int fila;
		int i;
		int j;
		String matriz[][];
		int resultado;
		// ejercicio 5 matriz bidimensional
		matriz = new String[5][5];
		i = 0;
		j = 0;
		matriz[0][0] = "1x1";
		matriz[1][0] = "2x1";
		matriz[2][0] = "3x1";
		matriz[3][0] = "4x1";
		matriz[4][0] = "5x1";
		matriz[0][1] = "1x2";
		matriz[1][1] = "2x2";
		matriz[2][1] = "3x2";
		matriz[3][1] = "4x2";
		matriz[4][1] = "5x2";
		matriz[0][2] = "1x3";
		matriz[1][2] = "2x3";
		matriz[2][2] = "3x3";
		matriz[3][2] = "4x3";
		matriz[4][2] = "5x3";
		matriz[0][3] = "1x4";
		matriz[1][3] = "2x4";
		matriz[2][3] = "3x4";
		matriz[3][3] = "4x4";
		matriz[4][3] = "5x4";
		matriz[0][4] = "1x5";
		matriz[1][4] = "2x5";
		matriz[2][4] = "3x5";
		matriz[3][4] = "4x5";
		matriz[4][4] = "5x5";
		for (fila=0;fila<=4;fila++) {
			for (columna=0;columna<=4;columna++) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" Marque una fila de 0-4");
		i = Integer.parseInt(bufEntrada.readLine());
		System.out.println(" Digite una columna de 0-4");
		j = Integer.parseInt(bufEntrada.readLine());
		if (i==0 && j==0) {
			resultado = 1*1;
			System.out.println(" El resultado de la casilla es: "+resultado);
		} else {
			if (i==0 && j==1) {
				resultado = 1*2;
				System.out.println(" El resultado de la casilla es: "+resultado);
			} else {
				if (i==0 && j==2) {
					resultado = 1*3;
					System.out.println(" El resultado de la casilla es: "+resultado);
				} else {
					if (i==0 && j==3) {
						resultado = 1*4;
						System.out.println(" El resultado de la casilla es: "+resultado);
					} else {
						if (i==0 && j==4) {
							resultado = 1*5;
							System.out.println(" El resultado de la casilla es: "+resultado);
						} else {
							if (i==1 && j==0) {
								resultado = 2*1;
								System.out.println(" El resultado de la casilla es: "+resultado);
							} else {
								if (i==1 && j==1) {
									resultado = 2*2;
									System.out.println(" El resultado de la casilla es: "+resultado);
								} else {
									if (i==1 && j==2) {
										resultado = 2*3;
										System.out.println(" El resultado de la casilla es: "+resultado);
									} else {
										if (i==1 && j==3) {
											resultado = 2*4;
											System.out.println(" El resultado de la casilla es: "+resultado);
										} else {
											if (i==1 && j==4) {
												resultado = 2*5;
												System.out.println(" El resultado de la casilla es: "+resultado);
											} else {
												if (i==2 && j==0) {
													resultado = 3*1;
													System.out.println(" El resultado de la casilla es: "+resultado);
												} else {
													if (i==2 && j==1) {
														resultado = 3*2;
														System.out.println(" El resultado de la casilla es: "+resultado);
													} else {
														if (i==2 && j==2) {
															resultado = 3*3;
															System.out.println(" El resultado de la casilla es: "+resultado);
														} else {
															if (i==2 && j==3) {
																resultado = 3*4;
																System.out.println(" El resultado de la casilla es: "+resultado);
															} else {
																if (i==2 && j==4) {
																	resultado = 3*5;
																	System.out.println(" El resultado de la casilla es: "+resultado);
																} else {
																	if (i==3 && j==0) {
																		resultado = 4*1;
																		System.out.println(" El resultado de la casilla es: "+resultado);
																	} else {
																		if (i==3 && j==1) {
																			resultado = 4*2;
																			System.out.println(" El resultado de la casilla es: "+resultado);
																		} else {
																			if (i==3 && j==2) {
																				resultado = 4*3;
																				System.out.println(" El resultado de la casilla es: "+resultado);
																			} else {
																				if (i==3 && j==3) {
																					resultado = 4*4;
																					System.out.println(" El resultado de la casilla es: "+resultado);
																				} else {
																					if (i==3 && j==4) {
																						resultado = 4*5;
																						System.out.println(" El resultado de la casilla es: "+resultado);
																					} else {
																						if (i==4 && j==0) {
																							resultado = 5*1;
																							System.out.println(" El resultado de la casilla es: "+resultado);
																						} else {
																							if (i==4 && j==1) {
																								resultado = 5*2;
																								System.out.println(" El resultado de la casilla es: "+resultado);
																							} else {
																								if (i==4 && j==2) {
																									resultado = 5*3;
																									System.out.println(" El resultado de la casilla es: "+resultado);
																								} else {
																									if (i==4 && j==3) {
																										resultado = 5*4;
																										System.out.println(" El resultado de la casilla es: "+resultado);
																									} else {
																										if (i==4 && j==4) {
																											resultado = 5*5;
																											System.out.println(" El resultado de la casilla es: "+resultado);
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


    
}
