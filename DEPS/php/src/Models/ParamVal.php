<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ParamVal extends Model {
    protected $_name = [
        'renderVal' => 'render_val',
        'scopeId' => 'scope_id',
        'scope' => 'scope',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->renderVal) {
            $res['render_val'] = $this->renderVal;
        }
        if (null !== $this->scopeId) {
            $res['scope_id'] = $this->scopeId;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ParamVal
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['render_val'])){
            $model->renderVal = $map['render_val'];
        }
        if(isset($map['scope_id'])){
            $model->scopeId = $map['scope_id'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        return $model;
    }
    // 参数渲染后的值
    /**
     * @example apaks
     * @var string
     */
    public $renderVal;

    // 某个 scope_id
    /**
     * @example 00000000300402
     * @var string
     */
    public $scopeId;

    // scope 类型
    /**
     * @example SITE,REGION,AZ,TENANT,WORKSPACEGROUP,WORKSPACE,CELL
     * @var string
     */
    public $scope;

}
