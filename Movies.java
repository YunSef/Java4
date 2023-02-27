class Movies {
	public static void main(String[] args) {
		
		String[] indieMovieNames = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade"};
		String[][] indieMoviesActors = new String[][] {
			{"Harrison Ford", "Karen Allen", "John Rhys-Davies"},
			{"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
			{"Harrison Ford", "Sean Connery", "Alison Doody"}
		};

		for (int i = 0; i<indieMovieNames.length; i++) {
		
			System.out.println("Dans le film "+ indieMovieNames[i] + " les acteurs sont " + indieMoviesActors[i][0] 
					+", "+ indieMoviesActors[i][1] + ", " + indieMoviesActors[i][2]);
			
		}
	}
}
