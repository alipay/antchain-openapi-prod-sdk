<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class Claim extends Model
{
    // 一个json的string，内容包含具体需要的声明，不同业务场景不同。
    /**
     * @example {"issuerName":"XX有限公司","userNo":"12123434"}
     *
     * @var string
     */
    public $claimContent;

    // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
    /**
     * @example Level1
     *
     * @var string
     */
    public $claimType;

    // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
    /**
     * @example -1
     *
     * @var int
     */
    public $expire;

    // 授权颁发可验证声明的目标did信息，通常为机构或组织的did
    /**
     * @example did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
     *
     * @var string
     */
    public $did;

    // 目标待授权的名称，标定唯一性，与claim内容配合使用，如果不指定did可以考虑使用此字段。
    /**
     * @example XX有限公司
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'claimContent' => 'claim_content',
        'claimType'    => 'claim_type',
        'expire'       => 'expire',
        'did'          => 'did',
        'name'         => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('claimContent', $this->claimContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->claimContent) {
            $res['claim_content'] = $this->claimContent;
        }
        if (null !== $this->claimType) {
            $res['claim_type'] = $this->claimType;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Claim
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['claim_content'])) {
            $model->claimContent = $map['claim_content'];
        }
        if (isset($map['claim_type'])) {
            $model->claimType = $map['claim_type'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
