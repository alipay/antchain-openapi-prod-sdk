<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDciUserRequest extends Model
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

    // 证件类型
    /**
     * @var string
     */
    public $certificateType;

    // 证件号
    /**
     * @var string
     */
    public $certificateNumber;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS：软件作品认证，如果不传默认为UGC
    /**
     * @var string
     */
    public $copyrightCertificationType;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'certificateType'            => 'certificate_type',
        'certificateNumber'          => 'certificate_number',
        'phone'                      => 'phone',
        'copyrightCertificationType' => 'copyright_certification_type',
    ];

    public function validate()
    {
        Model::validateRequired('certificateType', $this->certificateType, true);
        Model::validateRequired('certificateNumber', $this->certificateNumber, true);
        Model::validateRequired('phone', $this->phone, true);
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
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->certificateNumber) {
            $res['certificate_number'] = $this->certificateNumber;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->copyrightCertificationType) {
            $res['copyright_certification_type'] = $this->copyrightCertificationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDciUserRequest
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
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['certificate_number'])) {
            $model->certificateNumber = $map['certificate_number'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['copyright_certification_type'])) {
            $model->copyrightCertificationType = $map['copyright_certification_type'];
        }

        return $model;
    }
}
