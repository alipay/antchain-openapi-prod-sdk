<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateChainContractProjectRequest extends Model
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

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // consortium_id
    /**
     * @var string
     */
    public $consortiumId;

    // project_name
    /**
     * @var string
     */
    public $projectName;

    // project_version
    /**
     * @var string
     */
    public $projectVersion;

    // project_description
    /**
     * @var string
     */
    public $projectDescription;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'regionId'           => 'region_id',
        'consortiumId'       => 'consortium_id',
        'projectName'        => 'project_name',
        'projectVersion'     => 'project_version',
        'projectDescription' => 'project_description',
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
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectVersion) {
            $res['project_version'] = $this->projectVersion;
        }
        if (null !== $this->projectDescription) {
            $res['project_description'] = $this->projectDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateChainContractProjectRequest
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
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_version'])) {
            $model->projectVersion = $map['project_version'];
        }
        if (isset($map['project_description'])) {
            $model->projectDescription = $map['project_description'];
        }

        return $model;
    }
}
