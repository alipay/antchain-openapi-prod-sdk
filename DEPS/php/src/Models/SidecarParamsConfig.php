<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SidecarParamsConfig extends Model {
    protected $_name = [
        'type' => 'type',
        'params' => 'params',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SidecarParamsConfig
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['params'])){
            $model->params = $map['params'];
        }
        return $model;
    }
    // 类型：默认、透明劫持
    /**
     * @example default
     * @var string
     */
    public $type;

    // 环境参数内容
    /**
     * @example key1=value1
     * @var string
     */
    public $params;

}
