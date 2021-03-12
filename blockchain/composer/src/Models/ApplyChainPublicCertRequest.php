<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyChainPublicCertRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // bizid
    /**
     * @var string
     */
    public $bizid;

    // common_name
    /**
     * @var string
     */
    public $commonName;

    // country_name
    /**
     * @var string
     */
    public $countryName;

    // locality_name
    /**
     * @var string
     */
    public $localityName;

    // organization_name
    /**
     * @var string
     */
    public $organizationName;

    // organization_unit_name
    /**
     * @var string
     */
    public $organizationUnitName;

    // password
    /**
     * @var string
     */
    public $password;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // state_or_province_name
    /**
     * @var string
     */
    public $stateOrProvinceName;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'bizid'                => 'bizid',
        'commonName'           => 'common_name',
        'countryName'          => 'country_name',
        'localityName'         => 'locality_name',
        'organizationName'     => 'organization_name',
        'organizationUnitName' => 'organization_unit_name',
        'password'             => 'password',
        'regionId'             => 'region_id',
        'stateOrProvinceName'  => 'state_or_province_name',
    ];

    public function validate()
    {
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->commonName) {
            $res['common_name'] = $this->commonName;
        }
        if (null !== $this->countryName) {
            $res['country_name'] = $this->countryName;
        }
        if (null !== $this->localityName) {
            $res['locality_name'] = $this->localityName;
        }
        if (null !== $this->organizationName) {
            $res['organization_name'] = $this->organizationName;
        }
        if (null !== $this->organizationUnitName) {
            $res['organization_unit_name'] = $this->organizationUnitName;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->stateOrProvinceName) {
            $res['state_or_province_name'] = $this->stateOrProvinceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyChainPublicCertRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['common_name'])) {
            $model->commonName = $map['common_name'];
        }
        if (isset($map['country_name'])) {
            $model->countryName = $map['country_name'];
        }
        if (isset($map['locality_name'])) {
            $model->localityName = $map['locality_name'];
        }
        if (isset($map['organization_name'])) {
            $model->organizationName = $map['organization_name'];
        }
        if (isset($map['organization_unit_name'])) {
            $model->organizationUnitName = $map['organization_unit_name'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['state_or_province_name'])) {
            $model->stateOrProvinceName = $map['state_or_province_name'];
        }

        return $model;
    }
}
