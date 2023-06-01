# abstract-animals

Todo
Es1: classi astratte
Dobbiamo realizzare un programma che rappresenti il regno animale.

Creiamo quindi una classe astratta Animale e delle classi che la estendono : Cane, Passerotto, Aquila, Delfino

Vogliamo che gli animali abbiano i seguenti metodi:

void dormi(): mostra a video “Zzz”
void verso(): mostra a video il verso fatto dall'animale specifico
void mangia(): mostra a video quello che mangia (erba, carne, ...?)
Quali di questi metodi devono essere implementati nella classe astratta e quali devono essere lasciati astratti e implementati dalle classi concrete?

Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.

Instanziare inoltre un'array di classe Animale, inserire all'interno almeno un'istanza di ogni tipo concreto e stampare in console il verso di ogni animale.

Es2: interfacce
Alcuni degli animali che abbiamo creato volano, altri nuotano.

Gli animali che volano hanno il seguente metodo:

void vola(): mostra a video “Sto volando!!!”
Gli animali che nuotano hanno il seguente metodo:

void nuota(): mostra a video “Sto nuotando!!!”
Es2: BONUS
Scrivere una classe AnimaleManager avente 2 metodi:

void faiVolare(IVolante animale)
void faiNuotare(INuotante animale)
Questi metodi prendono come parametro un animale che può o volare/nuotare e richiamano il corrispondente metodo vola()/nuota()

Richiamare la classe AnimaleManager all'interno del main e testarne il funzionamento tramite animale in grado di volare/nuotare
