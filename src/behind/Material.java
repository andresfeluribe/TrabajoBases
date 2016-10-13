/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behind;

/**
 *
 * @author brandon.aguirre
 */
public class Material {
    
    private String id_material;

    public Material(String id_material) {
        this.id_material = id_material;
    }

    public String getId_material() {
        return id_material;
    }

    public void setId_material(String id_material) {
        this.id_material = id_material;
    }

    @Override
    public String toString() {
        return "Material{" + "id_material=" + id_material + '}';
    }
}
