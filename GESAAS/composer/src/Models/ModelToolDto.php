<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class ModelToolDto extends Model {
    protected $_name = [
        'type' => 'type',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ModelToolDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    // 指定使用的工具类型。
    // 枚举值：
    // + web_search（联网搜索工具。开启联网搜索后，模型会根据用户的提示词自主判断是否搜索互联网内容（如商品、天气等）。可提升生成视频的时效性，但也会增加一定的时延）0
    /**
     * @example web_search
     * @var string
     */
    public $type;

}
