<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SidecarTemplateConfig extends Model {
    protected $_name = [
        'type' => 'type',
        'template' => 'template',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('template', $this->template, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SidecarTemplateConfig
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['template'])){
            $model->template = $map['template'];
        }
        return $model;
    }
    // 类型：默认、透明劫持
    /**
     * @example default
     * @var string
     */
    public $type;

    // 模板内容
    /**
     * @example container:xxxx
     * @var string
     */
    public $template;

}
