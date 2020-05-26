/*
* TODO: this is one composition of material/Components in a specialized view.
*/
class Compositor {
    public:
    virtual int Compose(
        Coord natural[], Coord stretch[], Coord shrink[],
        int componentCount, int lineWidth, int breaks[]
    ) = 0;
    protected:
        Compositor();
};
