/**
* TODO: This would be composer of Views and will use Compositor objects to organize code in different 
* windows. 
*/
class Composition {
    public:
        Composition(Compositor*);
        void Repair();
    private:
        Compositor* _compositor;
        Component* _components;
        int _componentCount;
        int _lineWidth;
        int* _lineBreaks;

        int _lineCount;
};
