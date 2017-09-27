# Kartprogram
Skolprojekt 

Uppgiften går ut på att skapa ett program som visar en plan över ett kontor och där man kan ange var olika personer har sitt kontor och sedan få visat var vald persons kontor ligger.

Programmet ska skapa ett fönster som från början ser ut så här:

<img width="729" alt="kartbild" src="https://user-images.githubusercontent.com/12034626/30937607-99f65b50-a3d7-11e7-8b4d-5bb3459a469f.png">



I mitten finns en karta över plan 3 i Nod-huset, där DSVs anställda (lärare, forskare och administrativ och teknisk personal) har sina utrymmen (en bildfil med kartan bifogas). De ljusgröna rektanglarna visar var kontorsrummen (på kartan kallade ”cellkontor”) ligger. Varje kontorsrum hör till en viss person, men den informationen saknas från början.
Till vänster finns en lista (JList) som ska innehålla namn på personerna, från början är den tom.
Längst ner finns två knappar: ”Ange” och ”Visa”.
När användaren trycker på knappen ”Ange” ska programmet ställa en fråga:

<img width="300" alt="kartpic" src="https://user-images.githubusercontent.com/12034626/30939106-aff9291e-a3dc-11e7-90e2-1dde77be0f83.png">


Användaren ska mata in namnet på personen och klicka på ”Ok”, knappen, därefter ska användaren klicka på kartan, på det kontorsrum där personen sitter. Personens namn ska läggas till listan till vänster och en röd cirkel ska ritas ut på den platsen där användaren har klickat. 
Efter några sådana operationer kommer fönstret att se ut så här:

<img width="729" alt="kartbild3" src="https://user-images.githubusercontent.com/12034626/30939215-fef2239a-a3dc-11e7-8c2d-45997c1ded3f.png">

Lägg märke till namnen i listan, samt till den röda cirkeln som visas över Jozefs rum (”Jozef ” är vald i listan).
När användaren klickar på knappen ”Visa” så ska den röda cirkeln visas över kontorsrummet för den person som är vald i listan. Om ingen person är vald i listan så ska ingenting hända.
När användaren väljer en person i listan så behöver ingenting hända förrän användaren trycker på knappen ”Visa”, själva valet i listan behöver alltså inte orsaka någon åtgärd från programmet. Personerna i listan är inte vara sorterade i någon speciell ordning.
