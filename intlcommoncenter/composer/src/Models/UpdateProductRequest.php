<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTLCOMMONCENTER\Models;

use AlibabaCloud\Tea\Model;

class UpdateProductRequest extends Model
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

    // 产品线code
    /**
     * @var string
     */
    public $productCode;

    // L1code
    /**
     * @var string
     */
    public $businessLine;

    // L2code
    /**
     * @var string
     */
    public $productLine;

    // 研发负责人
    /**
     * @var string
     */
    public $devLeader;

    // 研发参与人
    /**
     * @var string
     */
    public $devs;

    // 产品负责人
    /**
     * @var string
     */
    public $pdLeader;

    // 产品参与人
    /**
     * @var string
     */
    public $pds;

    // 财务负责人
    /**
     * @var string
     */
    public $finance;

    // 法务负责人
    /**
     * @var string
     */
    public $legalOwner;

    // 产管
    /**
     * @var string
     */
    public $productAssistant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productCode'       => 'product_code',
        'businessLine'      => 'business_line',
        'productLine'       => 'product_line',
        'devLeader'         => 'dev_leader',
        'devs'              => 'devs',
        'pdLeader'          => 'pd_leader',
        'pds'               => 'pds',
        'finance'           => 'finance',
        'legalOwner'        => 'legal_owner',
        'productAssistant'  => 'product_assistant',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('businessLine', $this->businessLine, true);
        Model::validateRequired('productLine', $this->productLine, true);
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->businessLine) {
            $res['business_line'] = $this->businessLine;
        }
        if (null !== $this->productLine) {
            $res['product_line'] = $this->productLine;
        }
        if (null !== $this->devLeader) {
            $res['dev_leader'] = $this->devLeader;
        }
        if (null !== $this->devs) {
            $res['devs'] = $this->devs;
        }
        if (null !== $this->pdLeader) {
            $res['pd_leader'] = $this->pdLeader;
        }
        if (null !== $this->pds) {
            $res['pds'] = $this->pds;
        }
        if (null !== $this->finance) {
            $res['finance'] = $this->finance;
        }
        if (null !== $this->legalOwner) {
            $res['legal_owner'] = $this->legalOwner;
        }
        if (null !== $this->productAssistant) {
            $res['product_assistant'] = $this->productAssistant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateProductRequest
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
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['business_line'])) {
            $model->businessLine = $map['business_line'];
        }
        if (isset($map['product_line'])) {
            $model->productLine = $map['product_line'];
        }
        if (isset($map['dev_leader'])) {
            $model->devLeader = $map['dev_leader'];
        }
        if (isset($map['devs'])) {
            $model->devs = $map['devs'];
        }
        if (isset($map['pd_leader'])) {
            $model->pdLeader = $map['pd_leader'];
        }
        if (isset($map['pds'])) {
            $model->pds = $map['pds'];
        }
        if (isset($map['finance'])) {
            $model->finance = $map['finance'];
        }
        if (isset($map['legal_owner'])) {
            $model->legalOwner = $map['legal_owner'];
        }
        if (isset($map['product_assistant'])) {
            $model->productAssistant = $map['product_assistant'];
        }

        return $model;
    }
}
