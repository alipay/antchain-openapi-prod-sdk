<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class UploadFundCreditRequest extends Model
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

    // 订单号类型
    /**
     * @var string
     */
    public $orderNoType;

    // 订单号，或资产包号
    /**
     * @var string
     */
    public $orderNo;

    // 资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 凭证类型
    /**
     * @var string
     */
    public $creditType;

    // 凭证名称
    /**
     * @var string
     */
    public $creditName;

    // 文本类型
    /**
     * @var string
     */
    public $contentType;

    // 文本下载链接，如果类型是FILE则必填
    /**
     * @var string
     */
    public $fileUrl;

    // 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNoType'       => 'order_no_type',
        'orderNo'           => 'order_no',
        'fundId'            => 'fund_id',
        'creditType'        => 'credit_type',
        'creditName'        => 'credit_name',
        'contentType'       => 'content_type',
        'fileUrl'           => 'file_url',
        'content'           => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('orderNoType', $this->orderNoType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('creditType', $this->creditType, true);
        Model::validateRequired('contentType', $this->contentType, true);
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
        if (null !== $this->orderNoType) {
            $res['order_no_type'] = $this->orderNoType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->creditType) {
            $res['credit_type'] = $this->creditType;
        }
        if (null !== $this->creditName) {
            $res['credit_name'] = $this->creditName;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadFundCreditRequest
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
        if (isset($map['order_no_type'])) {
            $model->orderNoType = $map['order_no_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['credit_type'])) {
            $model->creditType = $map['credit_type'];
        }
        if (isset($map['credit_name'])) {
            $model->creditName = $map['credit_name'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
