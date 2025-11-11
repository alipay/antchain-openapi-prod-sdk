<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class ProjectBaseInfoVo extends Model
{
    // 项目id
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $projectId;

    // 资产项目合约地址
    // （Launch Network/Shares token ）
    /**
     * @example 0xf7d48f098440a166e9785ced7073baa6964acc80
     *
     * @var string
     */
    public $assetProjectAddress;

    // 项目名称
    /**
     * @example 测试项目
     *
     * @var string
     */
    public $projcetName;

    // 描述
    /**
     * @example 测试
     *
     * @var string
     */
    public $description;

    // 项目状态
    /**
     * @example Active
     *
     * @var string
     */
    public $projectStatus;

    // 项目所在链（Launch Network）
    /**
     * @example ANTCHAIN
     *
     * @var string
     */
    public $chainType;
    protected $_name = [
        'projectId'           => 'project_id',
        'assetProjectAddress' => 'asset_project_address',
        'projcetName'         => 'projcet_name',
        'description'         => 'description',
        'projectStatus'       => 'project_status',
        'chainType'           => 'chain_type',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->assetProjectAddress) {
            $res['asset_project_address'] = $this->assetProjectAddress;
        }
        if (null !== $this->projcetName) {
            $res['projcet_name'] = $this->projcetName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->projectStatus) {
            $res['project_status'] = $this->projectStatus;
        }
        if (null !== $this->chainType) {
            $res['chain_type'] = $this->chainType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProjectBaseInfoVo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['asset_project_address'])) {
            $model->assetProjectAddress = $map['asset_project_address'];
        }
        if (isset($map['projcet_name'])) {
            $model->projcetName = $map['projcet_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['project_status'])) {
            $model->projectStatus = $map['project_status'];
        }
        if (isset($map['chain_type'])) {
            $model->chainType = $map['chain_type'];
        }

        return $model;
    }
}
