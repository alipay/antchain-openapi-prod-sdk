<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CheckPfVoucherRequest extends Model
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

    // 融资主体did
    /**
     * @var string
     */
    public $financingSubjectDid;

    // 运单所属平台did
    /**
     * @var string
     */
    public $platformDid;

    // 凭证类型，支持 WAYBILL(运单)
    /**
     * @var string
     */
    public $voucherCategory;

    // 支持多个，逗号隔开
    /**
     * @var string
     */
    public $voucherIds;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'financingSubjectDid' => 'financing_subject_did',
        'platformDid'         => 'platform_did',
        'voucherCategory'     => 'voucher_category',
        'voucherIds'          => 'voucher_ids',
    ];

    public function validate()
    {
        Model::validateRequired('financingSubjectDid', $this->financingSubjectDid, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('voucherCategory', $this->voucherCategory, true);
        Model::validateRequired('voucherIds', $this->voucherIds, true);
        Model::validateMaxLength('financingSubjectDid', $this->financingSubjectDid, 80);
        Model::validateMaxLength('platformDid', $this->platformDid, 80);
        Model::validateMaxLength('voucherCategory', $this->voucherCategory, 100);
        Model::validateMaxLength('voucherIds', $this->voucherIds, 3000);
        Model::validateMinLength('voucherCategory', $this->voucherCategory, 1);
        Model::validateMinLength('voucherIds', $this->voucherIds, 1);
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
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->voucherCategory) {
            $res['voucher_category'] = $this->voucherCategory;
        }
        if (null !== $this->voucherIds) {
            $res['voucher_ids'] = $this->voucherIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckPfVoucherRequest
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
        if (isset($map['financing_subject_did'])) {
            $model->financingSubjectDid = $map['financing_subject_did'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['voucher_category'])) {
            $model->voucherCategory = $map['voucher_category'];
        }
        if (isset($map['voucher_ids'])) {
            $model->voucherIds = $map['voucher_ids'];
        }

        return $model;
    }
}
