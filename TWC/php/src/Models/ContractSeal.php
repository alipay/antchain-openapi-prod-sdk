<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractSeal extends Model {
    protected $_name = [
        'alias' => 'alias',
        'createDate' => 'create_date',
        'defaultFlag' => 'default_flag',
        'fileKey' => 'file_key',
        'height' => 'height',
        'sealBizType' => 'seal_biz_type',
        'sealId' => 'seal_id',
        'sealType' => 'seal_type',
        'url' => 'url',
        'width' => 'width',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->createDate) {
            $res['create_date'] = $this->createDate;
        }
        if (null !== $this->defaultFlag) {
            $res['default_flag'] = $this->defaultFlag;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->sealBizType) {
            $res['seal_biz_type'] = $this->sealBizType;
        }
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->sealType) {
            $res['seal_type'] = $this->sealType;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContractSeal
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        if(isset($map['create_date'])){
            $model->createDate = $map['create_date'];
        }
        if(isset($map['default_flag'])){
            $model->defaultFlag = $map['default_flag'];
        }
        if(isset($map['file_key'])){
            $model->fileKey = $map['file_key'];
        }
        if(isset($map['height'])){
            $model->height = $map['height'];
        }
        if(isset($map['seal_biz_type'])){
            $model->sealBizType = $map['seal_biz_type'];
        }
        if(isset($map['seal_id'])){
            $model->sealId = $map['seal_id'];
        }
        if(isset($map['seal_type'])){
            $model->sealType = $map['seal_type'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['width'])){
            $model->width = $map['width'];
        }
        return $model;
    }
    // 印章别名
    /**
     * @example 红色四方形印章
     * @var string
     */
    public $alias;

    // 印章创建时间
    /**
     * @example 1556161219000
     * @var int
     */
    public $createDate;

    // 默认印章标识
    /**
     * @example true, false
     * @var bool
     */
    public $defaultFlag;

    // 印章fileKey
    /**
     * @example $fbd1d433-9f8f-4439-b184-7eb75861b31f$1759125409
     * @var string
     */
    public $fileKey;

    // 印章高度
    /**
     * @example 100
     * @var int
     */
    public $height;

    // 印章业务类型，CANCELLATION-作废章，COMMON-其它
    /**
     * @example COMMON
     * @var string
     */
    public $sealBizType;

    // 印章id
    /**
     * @example bcd7ffd9-5caf-4342-bd1c-02257229ccd5
     * @var string
     */
    public $sealId;

    // 印章类型，1-机构模板章，2-个人模板章，3-自定义印章，4-手绘章
    /**
     * @example 2
     * @var int
     */
    public $sealType;

    // 印章下载地址, 有效时间1小时
    /**
     * @example https://esignoss.oss-cn-hangzhou.aliyuncs.com/seal-service/18bcc4c7-91
     * @var string
     */
    public $url;

    // 印章宽度
    /**
     * @example 100
     * @var int
     */
    public $width;

}
