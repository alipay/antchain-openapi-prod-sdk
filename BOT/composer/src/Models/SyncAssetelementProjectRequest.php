<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SyncAssetelementProjectRequest extends Model
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

    // 若要素项目已存在，是否进行全量覆盖
    /**
     * @var bool
     */
    public $coverExistProject;

    // 同步目标
    /**
     * @var string
     */
    public $destination;

    // 项目ID
    /**
     * @var string
     */
    public $projectId;

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 根元素ID列表
    /**
     * @var string
     */
    public $rootElements;

    // 是否只读
    /**
     * @var bool
     */
    public $readOnly;

    // 备注
    /**
     * @var string
     */
    public $remark;

    // 附件列表
    /**
     * @var string
     */
    public $attachmentList;

    // 产品Owner
    /**
     * @var string
     */
    public $pdOwner;

    // 要素项目tag，多个使用逗号分隔
    /**
     * @var string
     */
    public $tag;

    // 要素列表
    /**
     * @var AssetElementInfo[]
     */
    public $assetElementInfoList;

    // 要素关系列表
    /**
     * @var AssetElementRelationInfo[]
     */
    public $assetElementRelationInfoList;
    protected $_name = [
        'authToken'                    => 'auth_token',
        'productInstanceId'            => 'product_instance_id',
        'coverExistProject'            => 'cover_exist_project',
        'destination'                  => 'destination',
        'projectId'                    => 'project_id',
        'projectName'                  => 'project_name',
        'rootElements'                 => 'root_elements',
        'readOnly'                     => 'read_only',
        'remark'                       => 'remark',
        'attachmentList'               => 'attachment_list',
        'pdOwner'                      => 'pd_owner',
        'tag'                          => 'tag',
        'assetElementInfoList'         => 'asset_element_info_list',
        'assetElementRelationInfoList' => 'asset_element_relation_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('coverExistProject', $this->coverExistProject, true);
        Model::validateRequired('destination', $this->destination, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('readOnly', $this->readOnly, true);
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
        if (null !== $this->coverExistProject) {
            $res['cover_exist_project'] = $this->coverExistProject;
        }
        if (null !== $this->destination) {
            $res['destination'] = $this->destination;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->rootElements) {
            $res['root_elements'] = $this->rootElements;
        }
        if (null !== $this->readOnly) {
            $res['read_only'] = $this->readOnly;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->attachmentList) {
            $res['attachment_list'] = $this->attachmentList;
        }
        if (null !== $this->pdOwner) {
            $res['pd_owner'] = $this->pdOwner;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->assetElementInfoList) {
            $res['asset_element_info_list'] = [];
            if (null !== $this->assetElementInfoList && \is_array($this->assetElementInfoList)) {
                $n = 0;
                foreach ($this->assetElementInfoList as $item) {
                    $res['asset_element_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->assetElementRelationInfoList) {
            $res['asset_element_relation_info_list'] = [];
            if (null !== $this->assetElementRelationInfoList && \is_array($this->assetElementRelationInfoList)) {
                $n = 0;
                foreach ($this->assetElementRelationInfoList as $item) {
                    $res['asset_element_relation_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAssetelementProjectRequest
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
        if (isset($map['cover_exist_project'])) {
            $model->coverExistProject = $map['cover_exist_project'];
        }
        if (isset($map['destination'])) {
            $model->destination = $map['destination'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['root_elements'])) {
            $model->rootElements = $map['root_elements'];
        }
        if (isset($map['read_only'])) {
            $model->readOnly = $map['read_only'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['attachment_list'])) {
            $model->attachmentList = $map['attachment_list'];
        }
        if (isset($map['pd_owner'])) {
            $model->pdOwner = $map['pd_owner'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['asset_element_info_list'])) {
            if (!empty($map['asset_element_info_list'])) {
                $model->assetElementInfoList = [];
                $n                           = 0;
                foreach ($map['asset_element_info_list'] as $item) {
                    $model->assetElementInfoList[$n++] = null !== $item ? AssetElementInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['asset_element_relation_info_list'])) {
            if (!empty($map['asset_element_relation_info_list'])) {
                $model->assetElementRelationInfoList = [];
                $n                                   = 0;
                foreach ($map['asset_element_relation_info_list'] as $item) {
                    $model->assetElementRelationInfoList[$n++] = null !== $item ? AssetElementRelationInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
