<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequerySdkRequest extends Model
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

    // 页数，默认1
    /**
     * @var int
     */
    public $pageIndex;

    // 页码大小，默认10，最大100
    /**
     * @var int
     */
    public $pageSize;

    // sdk版本号
    /**
     * @var string
     */
    public $sdkVersionStr;

    // 公司名称
    /**
     * @var string
     */
    public $corpName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageIndex'         => 'page_index',
        'pageSize'          => 'page_size',
        'sdkVersionStr'     => 'sdk_version_str',
        'corpName'          => 'corp_name',
    ];

    public function validate()
    {
        Model::validateRequired('pageIndex', $this->pageIndex, true);
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
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->sdkVersionStr) {
            $res['sdk_version_str'] = $this->sdkVersionStr;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequerySdkRequest
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
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['sdk_version_str'])) {
            $model->sdkVersionStr = $map['sdk_version_str'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }

        return $model;
    }
}
