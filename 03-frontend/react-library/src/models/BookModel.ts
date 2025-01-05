class BookModel {
    id: number;
    title: string;
    author?: string; //optional
    description?: string; //optional
    copies?: number; //optional
    copiesAvailable?: number; //optional
    category?: string;//optional
    img?: string; //optional

    constructor(id: number, title: string, author: string, description: string,
            copies: number, copiesAvailable: number, category: string, img: string) {
                this.id = id;
                this.title = title;
                this.author = author;
                this.description = description;
                this.copies = copies;
                this.copiesAvailable = copiesAvailable;
                this.category = category;
                this.img = img;
    }
}

export default BookModel;