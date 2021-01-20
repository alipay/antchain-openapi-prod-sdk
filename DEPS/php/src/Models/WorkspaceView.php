<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\CellView;

class WorkspaceView extends Model {
    protected $_name = [
        'cells' => 'cells',
        'displayName' => 'display_name',
        'id' => 'id',
        'identity' => 'identity',
        'networkType' => 'network_type',
        'region' => 'region',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->cells) {
            $res['cells'] = [];
            if(null !== $this->cells && is_array($this->cells)){
                $n = 0;
                foreach($this->cells as $item){
                    $res['cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WorkspaceView
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cells'])){
            if(!empty($map['cells'])){
                $model->cells = [];
                $n = 0;
                foreach($map['cells'] as $item) {
                    $model->cells[$n++] = null !== $item ? CellView::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['network_type'])){
            $model->networkType = $map['network_type'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        return $model;
    }
    // 部署单元列表
    /**
     * @example 
     * @var CellView[]
     */
    public $cells;

    // 显示名称
    /**
     * @example 工作空间A
     * @var string
     */
    public $displayName;

    // table id
    /**
     * @example id
     * @var string
     */
    public $id;

    // 标识
    /**
     * @example workspaceA
     * @var string
     */
    public $identity;

    // 网络类型
    /**
     * @example network_type
     * @var string
     */
    public $networkType;

    // workspace所在region名称
    /**
     * @example region
     * @var string
     */
    public $region;

}
