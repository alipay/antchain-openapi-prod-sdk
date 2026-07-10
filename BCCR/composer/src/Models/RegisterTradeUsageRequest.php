<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class RegisterTradeUsageRequest extends Model
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

    // 标识某个服务实体的唯一ID，例如dciContentId
    /**
     * @var string
     */
    public $serviceId;

    // 服务类型，例如DCI、存证等
    /**
     * @var string
     */
    public $serviceType;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 扩展信息，JSON格式
    /**
     * @var string
     */
    public $extInfo;

    // 调用方唯一业务标识
    /**
     * @var string
     */
    public $outBizNo;

    // 文件类型，例如音频、视频、图片
    /**
     * @var string
     */
    public $fileType;

    // 待登记的文件Url
    /**
     * @var string
     */
    public $regFileUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceId'         => 'service_id',
        'serviceType'       => 'service_type',
        'bizType'           => 'biz_type',
        'extInfo'           => 'ext_info',
        'outBizNo'          => 'out_biz_no',
        'fileType'          => 'file_type',
        'regFileUrl'        => 'reg_file_url',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
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
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->regFileUrl) {
            $res['reg_file_url'] = $this->regFileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterTradeUsageRequest
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['reg_file_url'])) {
            $model->regFileUrl = $map['reg_file_url'];
        }

        return $model;
    }
}
