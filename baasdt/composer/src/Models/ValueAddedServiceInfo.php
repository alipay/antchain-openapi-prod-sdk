<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ValueAddedServiceInfo extends Model
{
    // 增值服务归属账户id
    /**
     * @example x x x x x
     *
     * @var string
     */
    public $accountId;

    // 增值服务id
    /**
     * @example x x x x x
     *
     * @var string
     */
    public $serviceId;

    // 增值服务名字
    /**
     * @example 增值服务名字
     *
     * @var string
     */
    public $serviceName;

    // 主图 链接地址
    /**
     * @example oss://1;oss://2
     *
     * @var string
     */
    public $images;

    // 详情图
    /**
     * @example oss://1;oss://2
     *
     * @var string
     */
    public $imagesDetail;

    // 增值服务描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $description;

    // 联系人列表
    /**
     * @example
     *
     * @var DockingPeopleInfo[]
     */
    public $dockingPeople;

    // 资质证明
    /**
     * @example x x x x x
     *
     * @var string
     */
    public $copyRight;

    // 备注
    /**
     * @example 备注
     *
     * @var string
     */
    public $memo;

    // 服务状态（0:待审核 1:审核拒绝 2:上线【审核通过】 3: 下线）
    /**
     * @example
     *
     * @var int
     */
    public $status;
    protected $_name = [
        'accountId'     => 'account_id',
        'serviceId'     => 'service_id',
        'serviceName'   => 'service_name',
        'images'        => 'images',
        'imagesDetail'  => 'images_detail',
        'description'   => 'description',
        'dockingPeople' => 'docking_people',
        'copyRight'     => 'copy_right',
        'memo'          => 'memo',
        'status'        => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('imagesDetail', $this->imagesDetail, true);
        Model::validateRequired('dockingPeople', $this->dockingPeople, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->imagesDetail) {
            $res['images_detail'] = $this->imagesDetail;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->dockingPeople) {
            $res['docking_people'] = [];
            if (null !== $this->dockingPeople && \is_array($this->dockingPeople)) {
                $n = 0;
                foreach ($this->dockingPeople as $item) {
                    $res['docking_people'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->copyRight) {
            $res['copy_right'] = $this->copyRight;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ValueAddedServiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['images'])) {
            $model->images = $map['images'];
        }
        if (isset($map['images_detail'])) {
            $model->imagesDetail = $map['images_detail'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['docking_people'])) {
            if (!empty($map['docking_people'])) {
                $model->dockingPeople = [];
                $n                    = 0;
                foreach ($map['docking_people'] as $item) {
                    $model->dockingPeople[$n++] = null !== $item ? DockingPeopleInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['copy_right'])) {
            $model->copyRight = $map['copy_right'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
