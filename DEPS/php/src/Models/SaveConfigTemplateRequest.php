<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\TemplateParamDef;

class SaveConfigTemplateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appName' => 'app_name',
        'comment' => 'comment',
        'params' => 'params',
        'tplId' => 'tpl_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->params) {
            $res['params'] = [];
            if(null !== $this->params && is_array($this->params)){
                $n = 0;
                foreach($this->params as $item){
                    $res['params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tplId) {
            $res['tpl_id'] = $this->tplId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveConfigTemplateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['comment'])){
            $model->comment = $map['comment'];
        }
        if(isset($map['params'])){
            if(!empty($map['params'])){
                $model->params = [];
                $n = 0;
                foreach($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? TemplateParamDef::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['tpl_id'])){
            $model->tplId = $map['tpl_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 描述
    /**
     * @var string
     */
    public $comment;

    // 参数定义列表
    /**
     * @var TemplateParamDef[]
     */
    public $params;

    // 参数模板 id
    /**
     * @var string
     */
    public $tplId;

}
