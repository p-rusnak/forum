export class Section {
  public id: string;
  public parentId: string;
  public name: string;
  public descr: string;
  public sections: Array<Section>;
  public posts: Array<object>;


  constructor(parentId: string, name: string, descr: string, sections: Array<Section>, posts: Array<Object>) {
    this.parentId = parentId;
    this.name = name;
    this.descr = descr;
    this.sections = sections;
    this.posts = posts;
  }
}
