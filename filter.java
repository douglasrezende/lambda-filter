formulariosAprovados = formularios
     .stream()
     .filter(formulario -> formulario.getStatus().getId().equals(idDominioStatusAprovado) )      
     .collect(Collectors.toList());
