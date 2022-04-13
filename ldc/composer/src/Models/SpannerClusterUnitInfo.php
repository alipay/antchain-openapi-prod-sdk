<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SpannerClusterUnitInfo extends Model
{
    // 单元IP地址
    /**
     * @example 11.166.185.233
     *
     * @var string
     */
    public $address;

    // 所属集群id
    /**
     * @example 072a69abe6362f140643cedb32b30e7152068ae499b025a31074dab44d77cb2f
     *
     * @var string
     */
    public $clusterId;

    // 容器id
    /**
     * @example 4c57a0ffaf3e9e42017b4b169cb7d701d8b3760b9bd1d9415b0404e97232c328
     *
     * @var string
     */
    public $containerId;

    // 创建时间
    /**
     * @example "2019-04-03T17:32:46.351646379+08:00"
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example "2019-04-03T17:32:46.351646379+08:00"
     *
     * @var string
     */
    public $gmtModify;

    // 集群单元状态 ： 1-下线状态 2- 上线状态 3-删除状态
    /**
     * @example 1，2，3
     *
     * @var int
     */
    public $status;

    // 扩展信息，json字符串格式
    /**
     * @example "{"key": "value"}"
     *
     * @var string
     */
    public $extendProperties;
    protected $_name = [
        'address'          => 'address',
        'clusterId'        => 'cluster_id',
        'containerId'      => 'container_id',
        'gmtCreate'        => 'gmt_create',
        'gmtModify'        => 'gmt_modify',
        'status'           => 'status',
        'extendProperties' => 'extend_properties',
    ];

    public function validate()
    {
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('containerId', $this->containerId, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModify', $this->gmtModify, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModify) {
            $res['gmt_modify'] = $this->gmtModify;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpannerClusterUnitInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modify'])) {
            $model->gmtModify = $map['gmt_modify'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['extend_properties'])) {
            $model->extendProperties = $map['extend_properties'];
        }

        return $model;
    }
}
