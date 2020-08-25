<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateTwcNotaryContractOrgsealRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'alias' => 'alias',
        'central' => 'central',
        'color' => 'color',
        'height' => 'height',
        'htext' => 'htext',
        'orgId' => 'org_id',
        'qtext' => 'qtext',
        'type' => 'type',
        'width' => 'width',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->central) {
            $res['central'] = $this->central;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->htext) {
            $res['htext'] = $this->htext;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->qtext) {
            $res['qtext'] = $this->qtext;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryContractOrgsealRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        if(isset($map['central'])){
            $model->central = $map['central'];
        }
        if(isset($map['color'])){
            $model->color = $map['color'];
        }
        if(isset($map['height'])){
            $model->height = $map['height'];
        }
        if(isset($map['htext'])){
            $model->htext = $map['htext'];
        }
        if(isset($map['org_id'])){
            $model->orgId = $map['org_id'];
        }
        if(isset($map['qtext'])){
            $model->qtext = $map['qtext'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['width'])){
            $model->width = $map['width'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 印章别名
    /**
     * @var string
     */
    public $alias;

    // 中心图案类型，STAR-圆形有五角星，NONE-圆形无五角星， 详见机构印章样式说明
    /**
     * @var string
     */
    public $central;

    // 印章颜色，RED-红色，BLUE-蓝色，BLACK-黑色
    /**
     * @var string
     */
    public $color;

    // 印章高度，默认159px
    /**
     * @var int
     */
    public $height;

    // 横向文，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
    /**
     * @var string
     */
    public $htext;

    // 机构ID
    /**
     * @var string
     */
    public $orgId;

    // 下弦文，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
    /**
     * @var string
     */
    public $qtext;

    // 模板类型，TEMPLATE_ROUND-圆章，TEMPLATE_OVAL-椭圆章， 详见机构印章样式说明
    /**
     * @var string
     */
    public $type;

    // 印章宽度，默认159px
    /**
     * @var int
     */
    public $width;

}
