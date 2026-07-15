<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\DocumentParagraphDTO;

class DocumentProcessingDataDTO extends Model {
    protected $_name = [
        'paragraphs' => 'paragraphs',
        'title' => 'title',
        'content' => 'content',
    ];
    public function validate() {
        Model::validateRequired('paragraphs', $this->paragraphs, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('content', $this->content, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->paragraphs) {
            $res['paragraphs'] = [];
            if(null !== $this->paragraphs && is_array($this->paragraphs)){
                $n = 0;
                foreach($this->paragraphs as $item){
                    $res['paragraphs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DocumentProcessingDataDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['paragraphs'])){
            if(!empty($map['paragraphs'])){
                $model->paragraphs = [];
                $n = 0;
                foreach($map['paragraphs'] as $item) {
                    $model->paragraphs[$n++] = null !== $item ? DocumentParagraphDTO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        return $model;
    }
    // 段落列表
    /**
     * @example undefined
     * @var DocumentParagraphDTO[]
     */
    public $paragraphs;

    // 文档标题
    /**
     * @example title
     * @var string
     */
    public $title;

    // 原文内容
    /**
     * @example content
     * @var string
     */
    public $content;

}
