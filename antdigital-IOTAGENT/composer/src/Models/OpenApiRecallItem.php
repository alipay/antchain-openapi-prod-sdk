<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiRecallItem extends Model {
    protected $_name = [
        'text' => 'text',
        'sourceFile' => 'source_file',
        'score' => 'score',
    ];
    public function validate() {
        Model::validateRequired('text', $this->text, true);
        Model::validateRequired('sourceFile', $this->sourceFile, true);
        Model::validateRequired('score', $this->score, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->sourceFile) {
            $res['source_file'] = $this->sourceFile;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiRecallItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['text'])){
            $model->text = $map['text'];
        }
        if(isset($map['source_file'])){
            $model->sourceFile = $map['source_file'];
        }
        if(isset($map['score'])){
            $model->score = $map['score'];
        }
        return $model;
    }
    /**
     * @example undefined
     * @var string
     */
    public $text;

    /**
     * @example undefined
     * @var string
     */
    public $sourceFile;

    // 现有召回引擎原始相关性分数，不假定0到1
    /**
     * @example undefined
     * @var int
     */
    public $score;

}
