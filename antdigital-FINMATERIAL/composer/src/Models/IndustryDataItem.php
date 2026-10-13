<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class IndustryDataItem extends Model {
    protected $_name = [
        'title' => 'title',
        'type' => 'type',
        'result' => 'result',
    ];
    public function validate() {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('result', $this->result, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IndustryDataItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['result'])){
            $model->result = $map['result'];
        }
        return $model;
    }
    // 行业数据标题
    /**
     * @example -
     * @var string
     */
    public $title;

    // 行业数据类型及结构标识，用于确定 CardData 的字段结构
    /**
     * @example -
     * @var string
     */
    public $type;

    // 行业结构化数据，字段随 Type 定义
    /**
     * @example -
     * @var string
     */
    public $result;

}
