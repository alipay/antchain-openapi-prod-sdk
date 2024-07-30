<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIotlinkAppreleaseorderRequest extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $apkName;

    // 应用版本号
    /**
     * @var string
     */
    public $apkVersion;

    // 工单id
    /**
     * @var string
     */
    public $orderId;

    // 发布批次状态
    // 升级中：IN_PROGRESS
    // 取消中：CANCELING
    // 部分成功：PARTIAL_SUCCESS
    // 部分失败：PARTIAL_FAILED
    // 部分取消：PARTIAL_CANCELED
    // 全部成功：ALL_SUCCESS
    // 全部失败：ALL_FAILED
    // 全部取消：ALL_CANCELED
    /**
     * @var string
     */
    public $status;

    // 当前页
    /**
     * @var int
     */
    public $current;

    // 每页数量
    /**
     * @var int
     */
    public $pageSize;

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apkName'           => 'apk_name',
        'apkVersion'        => 'apk_version',
        'orderId'           => 'order_id',
        'status'            => 'status',
        'current'           => 'current',
        'pageSize'          => 'page_size',
        'categoryCode'      => 'category_code',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->apkName) {
            $res['apk_name'] = $this->apkName;
        }
        if (null !== $this->apkVersion) {
            $res['apk_version'] = $this->apkVersion;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIotlinkAppreleaseorderRequest
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
        if (isset($map['apk_name'])) {
            $model->apkName = $map['apk_name'];
        }
        if (isset($map['apk_version'])) {
            $model->apkVersion = $map['apk_version'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }

        return $model;
    }
}
