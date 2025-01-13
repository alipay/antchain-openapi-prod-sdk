<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTLCOMMONCENTER\Models;

use AlibabaCloud\Tea\Model;

class ImportProductRequest extends Model
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

    // 商业化状态
    /**
     * @var string
     */
    public $businessStatus;

    // 是否已上架蚂蚁链官网
    /**
     * @var string
     */
    public $productPutAntOfficial;

    // 产品名称
    /**
     * @var string
     */
    public $name;

    // 橡实立项code
    /**
     * @var string
     */
    public $xsCode;

    // 上线时间
    /**
     * @var string
     */
    public $startTime;

    // 产品经理
    /**
     * @var string
     */
    public $pd;

    // 产品经理负责人
    /**
     * @var string
     */
    public $pdLeader;

    // 产品研发负责人
    /**
     * @var string
     */
    public $devLeader;

    // 产品研发
    /**
     * @var string
     */
    public $dev;

    // 产品描述
    /**
     * @var string
     */
    public $description;

    // 操作员
    /**
     * @var string
     */
    public $operator;

    // 业务线id
    /**
     * @var string
     */
    public $businessLine;

    // 产品线id
    /**
     * @var string
     */
    public $productLine;

    // 产品code
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'businessStatus'        => 'business_status',
        'productPutAntOfficial' => 'product_put_ant_official',
        'name'                  => 'name',
        'xsCode'                => 'xs_code',
        'startTime'             => 'start_time',
        'pd'                    => 'pd',
        'pdLeader'              => 'pd_leader',
        'devLeader'             => 'dev_leader',
        'dev'                   => 'dev',
        'description'           => 'description',
        'operator'              => 'operator',
        'businessLine'          => 'business_line',
        'productLine'           => 'product_line',
        'productCode'           => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('businessStatus', $this->businessStatus, true);
        Model::validateRequired('productPutAntOfficial', $this->productPutAntOfficial, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('xsCode', $this->xsCode, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('pd', $this->pd, true);
        Model::validateRequired('pdLeader', $this->pdLeader, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('businessLine', $this->businessLine, true);
        Model::validateRequired('productLine', $this->productLine, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->businessStatus) {
            $res['business_status'] = $this->businessStatus;
        }
        if (null !== $this->productPutAntOfficial) {
            $res['product_put_ant_official'] = $this->productPutAntOfficial;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->xsCode) {
            $res['xs_code'] = $this->xsCode;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->pd) {
            $res['pd'] = $this->pd;
        }
        if (null !== $this->pdLeader) {
            $res['pd_leader'] = $this->pdLeader;
        }
        if (null !== $this->devLeader) {
            $res['dev_leader'] = $this->devLeader;
        }
        if (null !== $this->dev) {
            $res['dev'] = $this->dev;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->businessLine) {
            $res['business_line'] = $this->businessLine;
        }
        if (null !== $this->productLine) {
            $res['product_line'] = $this->productLine;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportProductRequest
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
        if (isset($map['business_status'])) {
            $model->businessStatus = $map['business_status'];
        }
        if (isset($map['product_put_ant_official'])) {
            $model->productPutAntOfficial = $map['product_put_ant_official'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['xs_code'])) {
            $model->xsCode = $map['xs_code'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['pd'])) {
            $model->pd = $map['pd'];
        }
        if (isset($map['pd_leader'])) {
            $model->pdLeader = $map['pd_leader'];
        }
        if (isset($map['dev_leader'])) {
            $model->devLeader = $map['dev_leader'];
        }
        if (isset($map['dev'])) {
            $model->dev = $map['dev'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['business_line'])) {
            $model->businessLine = $map['business_line'];
        }
        if (isset($map['product_line'])) {
            $model->productLine = $map['product_line'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
