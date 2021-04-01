<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyChainCertAntRequest extends Model
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

    // ant_chain_id
    /**
     * @var string
     */
    public $antChainId;

    // common_name
    /**
     * @var string
     */
    public $commonName;

    // consortium_id
    /**
     * @var string
     */
    public $consortiumId;

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
        'antChainId'           => 'ant_chain_id',
        'commonName'           => 'common_name',
        'consortiumId'         => 'consortium_id',
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
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('commonName', $this->commonName, true);
        Model::validateRequired('consortiumId', $this->consortiumId, true);
        Model::validateRequired('countryName', $this->countryName, true);
        Model::validateRequired('localityName', $this->localityName, true);
        Model::validateRequired('organizationName', $this->organizationName, true);
        Model::validateRequired('organizationUnitName', $this->organizationUnitName, true);
        Model::validateRequired('password', $this->password, true);
        Model::validateRequired('stateOrProvinceName', $this->stateOrProvinceName, true);
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
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->commonName) {
            $res['common_name'] = $this->commonName;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
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
     * @return ApplyChainCertAntRequest
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
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['common_name'])) {
            $model->commonName = $map['common_name'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
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
