# MarketingMaterial_PrototypeDesignPattern

This project demonstrates the **Prototype Design Pattern** in the context of creating marketing materials. It showcases how to create clones of existing objects with the ability to modify certain properties, enhancing efficiency in object creation.

## Project Structure

The project consists of a base class for marketing materials and several subclasses representing specific types of materials. It implements the Prototype pattern to facilitate cloning.

### 1. `MarketingMaterial`
   - This is the base class representing general marketing materials.
   - It contains fields for `layout`, `content`, and `color`, along with their respective getters and setters.
   - The `toString()` method provides a string representation of the object.

### 2. Subclasses of `MarketingMaterial`
   - **Flyer**: Represents a flyer with a specific layout, content, and color.
   - **Brochure**: Represents a brochure, following the same structure as `Flyer`.
   - **Poster**: Represents a poster, also inheriting from `MarketingMaterial`.
   - Each subclass implements the `CloneableMarketingMaterial` interface and provides a `clone()` method to create a copy of itself.

### 3. `CloneableMarketingMaterial` (Interface)
   - This interface defines a `clone()` method that must be implemented by all marketing material classes.
   - It enforces a contract for cloning behavior, ensuring that all subclasses can be cloned.

### 4. `Main`
   - This class contains the `main` method, demonstrating the use of the Prototype pattern.
   - It creates instances of `Flyer` and `Poster`, clones them, modifies certain properties, and prints the details of each object.

## How It Works

1. **Prototype Pattern Implementation**:
   - The Prototype pattern allows for the creation of new objects by copying existing ones rather than constructing them from scratch.
   - Each specific marketing material class (`Flyer`, `Brochure`, `Poster`) implements the `clone()` method to return a new instance with the same properties as the original.

2. **Cloning Process**:
   - A new `Flyer` is created, and then a clone of that flyer is made. The clone can be modified without affecting the original.
   - The same process is applied to `Poster` objects, demonstrating the flexibility and efficiency of the Prototype pattern.

## Sample Output

```plaintext
MarketingMaterial{layout='Flyer-A4', content='Welcome to prototype design pattern', color='Green'}
MarketingMaterial{layout='Flyer-A4', content='Cloned Flyer', color='White'}
MarketingMaterial{layout='Poster-A3', content='Welcome to prototype design pattern', color='Red'}
MarketingMaterial{layout='Poster-A3', content='Welcome to prototype design pattern', color='Black'}
```

## Key Takeaways
- The Prototype Pattern provides a way to create new objects based on existing ones, promoting efficiency and reducing overhead in object creation.
- Cloning allows for easy modifications of object properties without affecting the original instance.
- This design is especially useful in scenarios where object creation is costly or complex.


## Usage
1. Clone the repository and navigate to the project directory.
2. Compile the project files.
3. Run the `Main` class to see the Prototype pattern in action with marketing materials.
