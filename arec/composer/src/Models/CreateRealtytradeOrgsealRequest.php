<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class CreateRealtytradeOrgsealRequest extends Model
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

    // 企业账户注册时返回的机构ID
    /**
     * @var string
     */
    public $orgId;

    // 印章样式说明，Round-圆章，Oval-椭圆章，默认Round
    /**
     * @var string
     */
    public $templateType;

    // 印章颜色，ed-红色，Blue-蓝色，Black-黑色，默认Red
    /**
     * @var string
     */
    public $sealColor;

    // 中心图案类型，Star-圆形有五角星，None-圆形无五角星，默认None
    /**
     * @var string
     */
    public $centerPattern;

    // 企业用章说明，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
    /**
     * @var string
     */
    public $horizontalTitle;

    // 企业用章日期范围等，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
    /**
     * @var string
     */
    public $lastTitle;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orgId'             => 'org_id',
        'templateType'      => 'template_type',
        'sealColor'         => 'seal_color',
        'centerPattern'     => 'center_pattern',
        'horizontalTitle'   => 'horizontal_title',
        'lastTitle'         => 'last_title',
    ];

    public function validate()
    {
        Model::validateRequired('orgId', $this->orgId, true);
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
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->templateType) {
            $res['template_type'] = $this->templateType;
        }
        if (null !== $this->sealColor) {
            $res['seal_color'] = $this->sealColor;
        }
        if (null !== $this->centerPattern) {
            $res['center_pattern'] = $this->centerPattern;
        }
        if (null !== $this->horizontalTitle) {
            $res['horizontal_title'] = $this->horizontalTitle;
        }
        if (null !== $this->lastTitle) {
            $res['last_title'] = $this->lastTitle;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRealtytradeOrgsealRequest
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
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['template_type'])) {
            $model->templateType = $map['template_type'];
        }
        if (isset($map['seal_color'])) {
            $model->sealColor = $map['seal_color'];
        }
        if (isset($map['center_pattern'])) {
            $model->centerPattern = $map['center_pattern'];
        }
        if (isset($map['horizontal_title'])) {
            $model->horizontalTitle = $map['horizontal_title'];
        }
        if (isset($map['last_title'])) {
            $model->lastTitle = $map['last_title'];
        }

        return $model;
    }
}
