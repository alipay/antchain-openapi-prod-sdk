<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class PublishGoodRequest extends Model
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

    // 文件id,最长64个字符
    /**
     * @var string
     */
    public $fileId;

    // 商品标题，最长64个字符
    /**
     * @var string
     */
    public $title;

    // 商品名称
    /**
     * @var string
     */
    public $goodsName;

    // 商品分类
    /**
     * @var string
     */
    public $classification;

    // 售价（分）
    /**
     * @var int
     */
    public $standardPriceInCent;

    // 上架/下架，默认上架
    /**
     * @var string
     */
    public $goodsStatus;

    // 发布时间，默认直接发布
    /**
     * @var int
     */
    public $publishTime;

    // 授权期限起始时间
    /**
     * @var int
     */
    public $authStartTime;

    // 授权期限结束时间（传-1 则为永久）
    /**
     * @var int
     */
    public $authEndTime;

    // 是否是作者
    /**
     * @var bool
     */
    public $isAuthor;

    // 作者姓名，如果isAuthor为false则必填，最长30个字符
    /**
     * @var string
     */
    public $authorCertName;

    // 作者身份证号,如果isAuthor为false则必填
    /**
     * @var string
     */
    public $authorCertNo;

    // 幂等号，可以保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    /**
     * @var string
     */
    public $clientToken;

    // 授权信息
    /**
     * @var AuthInfo[]
     */
    public $authInfo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'fileId'              => 'file_id',
        'title'               => 'title',
        'goodsName'           => 'goods_name',
        'classification'      => 'classification',
        'standardPriceInCent' => 'standard_price_in_cent',
        'goodsStatus'         => 'goods_status',
        'publishTime'         => 'publish_time',
        'authStartTime'       => 'auth_start_time',
        'authEndTime'         => 'auth_end_time',
        'isAuthor'            => 'is_author',
        'authorCertName'      => 'author_cert_name',
        'authorCertNo'        => 'author_cert_no',
        'clientToken'         => 'client_token',
        'authInfo'            => 'auth_info',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('standardPriceInCent', $this->standardPriceInCent, true);
        Model::validateRequired('authStartTime', $this->authStartTime, true);
        Model::validateRequired('authEndTime', $this->authEndTime, true);
        Model::validateRequired('isAuthor', $this->isAuthor, true);
        Model::validateRequired('authInfo', $this->authInfo, true);
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
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->classification) {
            $res['classification'] = $this->classification;
        }
        if (null !== $this->standardPriceInCent) {
            $res['standard_price_in_cent'] = $this->standardPriceInCent;
        }
        if (null !== $this->goodsStatus) {
            $res['goods_status'] = $this->goodsStatus;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->isAuthor) {
            $res['is_author'] = $this->isAuthor;
        }
        if (null !== $this->authorCertName) {
            $res['author_cert_name'] = $this->authorCertName;
        }
        if (null !== $this->authorCertNo) {
            $res['author_cert_no'] = $this->authorCertNo;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->authInfo) {
            $res['auth_info'] = [];
            if (null !== $this->authInfo && \is_array($this->authInfo)) {
                $n = 0;
                foreach ($this->authInfo as $item) {
                    $res['auth_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishGoodRequest
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
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['classification'])) {
            $model->classification = $map['classification'];
        }
        if (isset($map['standard_price_in_cent'])) {
            $model->standardPriceInCent = $map['standard_price_in_cent'];
        }
        if (isset($map['goods_status'])) {
            $model->goodsStatus = $map['goods_status'];
        }
        if (isset($map['publish_time'])) {
            $model->publishTime = $map['publish_time'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['is_author'])) {
            $model->isAuthor = $map['is_author'];
        }
        if (isset($map['author_cert_name'])) {
            $model->authorCertName = $map['author_cert_name'];
        }
        if (isset($map['author_cert_no'])) {
            $model->authorCertNo = $map['author_cert_no'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['auth_info'])) {
            if (!empty($map['auth_info'])) {
                $model->authInfo = [];
                $n               = 0;
                foreach ($map['auth_info'] as $item) {
                    $model->authInfo[$n++] = null !== $item ? AuthInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
