<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarScopeDetail;

class Sidecar extends Model {
    protected $_name = [
        'description' => 'description',
        'gmtCreated' => 'gmt_created',
        'gmtModified' => 'gmt_modified',
        'sidecarName' => 'sidecar_name',
        'scopeDetail' => 'scope_detail',
    ];
    public function validate() {
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('scopeDetail', $this->scopeDetail, true);
        Model::validatePattern('gmtCreated', $this->gmtCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->scopeDetail) {
            $res['scope_detail'] = null !== $this->scopeDetail ? $this->scopeDetail->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Sidecar
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['gmt_created'])){
            $model->gmtCreated = $map['gmt_created'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['sidecar_name'])){
            $model->sidecarName = $map['sidecar_name'];
        }
        if(isset($map['scope_detail'])){
            $model->scopeDetail = SidecarScopeDetail::fromMap($map['scope_detail']);
        }
        return $model;
    }
    // sidecar描述内容
    /**
     * @example mesh sidecar
     * @var string
     */
    public $description;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtCreated;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtModified;

    // sidecar名称
    /**
     * @example mosn
     * @var string
     */
    public $sidecarName;

    // scope生效范围详情
    /**
     * @example 
     * @var SidecarScopeDetail
     */
    public $scopeDetail;

}
