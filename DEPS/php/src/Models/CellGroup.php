<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\DeployCell;
use AntChain\Deps\Models\DisasterInfo;

class CellGroup extends Model {
    protected $_name = [
        'cells' => 'cells',
        'datacenter' => 'datacenter',
        'defaultGzone' => 'default_gzone',
        'disasterInfo' => 'disaster_info',
        'modifiedTime' => 'modified_time',
        'name' => 'name',
        'operator' => 'operator',
        'region' => 'region',
        'type' => 'type',
    ];
    public function validate() {
        Model::validateRequired('cells', $this->cells, true);
        Model::validateRequired('disasterInfo', $this->disasterInfo, true);
        Model::validateRequired('modifiedTime', $this->modifiedTime, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('type', $this->type, true);
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
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
        if (null !== $this->datacenter) {
            $res['datacenter'] = $this->datacenter;
        }
        if (null !== $this->defaultGzone) {
            $res['default_gzone'] = $this->defaultGzone;
        }
        if (null !== $this->disasterInfo) {
            $res['disaster_info'] = [];
            if(null !== $this->disasterInfo && is_array($this->disasterInfo)){
                $n = 0;
                foreach($this->disasterInfo as $item){
                    $res['disaster_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CellGroup
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cells'])){
            if(!empty($map['cells'])){
                $model->cells = [];
                $n = 0;
                foreach($map['cells'] as $item) {
                    $model->cells[$n++] = null !== $item ? DeployCell::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['datacenter'])){
            $model->datacenter = $map['datacenter'];
        }
        if(isset($map['default_gzone'])){
            $model->defaultGzone = $map['default_gzone'];
        }
        if(isset($map['disaster_info'])){
            if(!empty($map['disaster_info'])){
                $model->disasterInfo = [];
                $n = 0;
                foreach($map['disaster_info'] as $item) {
                    $model->disasterInfo[$n++] = null !== $item ? DisasterInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['modified_time'])){
            $model->modifiedTime = $map['modified_time'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['operator'])){
            $model->operator = $map['operator'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    // 包含部署单元列表
    /**
     * @example [{}]
     * @var DeployCell[]
     */
    public $cells;

    // 机房名称
    /**
     * @example cm10
     * @var string
     */
    public $datacenter;

    // 默认全局域
    /**
     * @example GZ00
     * @var string
     */
    public $defaultGzone;

    // 逻辑单元灾备信息
    /**
     * @example [{}]
     * @var DisasterInfo[]
     */
    public $disasterInfo;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modifiedTime;

    // 逻辑单元名称
    /**
     * @example RZ01
     * @var string
     */
    public $name;

    // 操作人
    /**
     * @example xxx
     * @var string
     */
    public $operator;

    // 所属地域：CZone Group 必填
    /**
     * @example cn-hangzhou
     * @var string
     */
    public $region;

    // 逻辑单元类型
    /**
     * @example RZONE
     * @var string
     */
    public $type;

}
