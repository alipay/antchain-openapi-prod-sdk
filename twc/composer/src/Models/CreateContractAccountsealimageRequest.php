<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractAccountsealimageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 用户id
    /**
     * @var string
     */
    public $accountId;

    // 印章别名
    /**
     * @var string
     */
    public $alias;

    // 印章高度, 个人默认95px, 机构默认159px
    /**
     * @var int
     */
    public $height;

    // 印章宽度, 个人默认95px, 机构默认159px
    /**
     * @var int
     */
    public $width;

    // 印章数据类型，BASE64：base64格式
    /**
     * @var string
     */
    public $type;

    // 印章数据，base64格式字符串，不包含格式前缀
    /**
     * @var string
     */
    public $data;

    // 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
    /**
     * @var bool
     */
    public $transparentFlag;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountId'         => 'account_id',
        'alias'             => 'alias',
        'height'            => 'height',
        'width'             => 'width',
        'type'              => 'type',
        'data'              => 'data',
        'transparentFlag'   => 'transparent_flag',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('data', $this->data, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->transparentFlag) {
            $res['transparent_flag'] = $this->transparentFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractAccountsealimageRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['transparent_flag'])) {
            $model->transparentFlag = $map['transparent_flag'];
        }

        return $model;
    }
}
