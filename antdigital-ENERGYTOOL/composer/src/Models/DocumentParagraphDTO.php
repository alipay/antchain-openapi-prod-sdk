<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\DocumentChunkDTO;

class DocumentParagraphDTO extends Model {
    protected $_name = [
        'title' => 'title',
        'content' => 'content',
        'chunks' => 'chunks',
    ];
    public function validate() {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('chunks', $this->chunks, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->chunks) {
            $res['chunks'] = [];
            if(null !== $this->chunks && is_array($this->chunks)){
                $n = 0;
                foreach($this->chunks as $item){
                    $res['chunks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DocumentParagraphDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['chunks'])){
            if(!empty($map['chunks'])){
                $model->chunks = [];
                $n = 0;
                foreach($map['chunks'] as $item) {
                    $model->chunks[$n++] = null !== $item ? DocumentChunkDTO::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 段落标题
    /**
     * @example title
     * @var string
     */
    public $title;

    // 段落内容
    /**
     * @example content
     * @var string
     */
    public $content;

    // 切片列表
    /**
     * @example undefined
     * @var DocumentChunkDTO[]
     */
    public $chunks;

}
