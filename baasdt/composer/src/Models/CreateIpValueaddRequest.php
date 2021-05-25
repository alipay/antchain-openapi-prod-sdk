<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateIpValueaddRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 基础字段
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 创建增值服务的账户id
    /**
     * @var string
     */
    public $accountId;

    // 服务名字
    /**
     * @var string
     */
    public $serviceName;

    // 商品主图，存放OSS图片链接,多张用;隔开
    /**
     * @var string
     */
    public $images;

    // 商品详情图  存放OSS图片链接,多张用;隔开
    /**
     * @var string
     */
    public $imagesDetail;

    // 商品描述
    /**
     * @var string
     */
    public $description;

    // 联系人
    /**
     * @var DockingPeopleInfo[]
     */
    public $dockingPeople;

    // 资质证明
    /**
     * @var string
     */
    public $copyRight;

    // 备注
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'serviceName'       => 'service_name',
        'images'            => 'images',
        'imagesDetail'      => 'images_detail',
        'description'       => 'description',
        'dockingPeople'     => 'docking_people',
        'copyRight'         => 'copy_right',
        'memo'              => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('imagesDetail', $this->imagesDetail, true);
        Model::validateRequired('dockingPeople', $this->dockingPeople, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateIpValueaddRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
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

        return $model;
    }
}
