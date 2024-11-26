import { IoIosAdd } from "react-icons/io";

function AddNote({
    noteTitle, noteContent, noteAuthor, noteColor,
    updateTitle, updateContent, updateAuthor, updateColor,
    addNote,
    showAdd, handleShowAdd
}) {

    return (
        <div className="add-container">
            <IoIosAdd id="hh" className="add-circle" onClick={handleShowAdd} />
            {showAdd &&
                <div className="add-fields">
                  <input id="title" value={noteTitle} onChange={updateTitle} placeholder="Title"/>
                  <br />
                  <input id="note" value={noteContent} onChange={updateContent} placeholder="Note"/>
                  <br />
                  <input id="auth" value={noteAuthor} onChange={updateAuthor} placeholder="Author" />
                  <br />
                  <select id="yy" value={noteColor} onChange={updateColor}>
                      <option value="">select color</option>
                      <option value="brown-sugar">brown</option>
                      <option value="atomic-tangerine">tangerine</option>
                      <option value="cadet-gray">grey</option>
                      <option value="phlox">purple</option>
                      <option value="tea-green">green</option>
                  </select>
                  <br />
                  <button id="bt" onClick={addNote}>Save</button>
                </div>
            }
        </div>
    )
}
export default AddNote;