<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d55db67c8e5a4e799ff51ac9e5bcede3\Models;

use AlibabaCloud\Tea\Model;

class CloneBaasChainContractProjectRequest extends Model
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

    // consortium_id
    /**
     * @var string
     */
    public $consortiumId;

    // project_description
    /**
     * @var string
     */
    public $projectDescription;

    // project_id
    /**
     * @var string
     */
    public $projectId;

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

    // region_id
    /**
     * @var string
     */
    public $regionId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'consortiumId'       => 'consortium_id',
        'projectDescription' => 'project_description',
        'projectId'          => 'project_id',
        'projectName'        => 'project_name',
        'projectVersion'     => 'project_version',
        'regionId'           => 'region_id',
    ];

    public function validate()
    {
        Model::validateRequired('consortiumId', $this->consortiumId, true);
        Model::validateRequired('projectDescription', $this->projectDescription, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('projectVersion', $this->projectVersion, true);
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
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->projectDescription) {
            $res['project_description'] = $this->projectDescription;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectVersion) {
            $res['project_version'] = $this->projectVersion;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloneBaasChainContractProjectRequest
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
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['project_description'])) {
            $model->projectDescription = $map['project_description'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_version'])) {
            $model->projectVersion = $map['project_version'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}
