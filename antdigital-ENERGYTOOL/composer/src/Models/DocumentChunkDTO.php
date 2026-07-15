<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class DocumentChunkDTO extends Model {
    protected $_name = [
        'content' => 'content',
    ];
    public function validate() {
        Model::validateRequired('content', $this->content, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DocumentChunkDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        return $model;
    }
    // 切片内容
    /**
     * @example content
     * @var string
     */
    public $content;

}
