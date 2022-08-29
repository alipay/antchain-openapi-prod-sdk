<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class AddContentRequest extends Model
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

    // 文件id
    /**
     * @var string
     */
    public $fileId;

    // 内容标题
    /**
     * @var string
     */
    public $title;

    // 文件类型
    /**
     * @var string
     */
    public $type;

    // 内容标签列表
    /**
     * @var string[]
     */
    public $keywords;

    // 内容描述
    /**
     * @var string
     */
    public $description;

    // 内容封面文件id
    /**
     * @var string
     */
    public $coverFileId;

    // 播放列表名称
    /**
     * @var string
     */
    public $playListName;

    // 授权类型
    /**
     * @var string
     */
    public $authorizeType;

    // 授权范围类型
    /**
     * @var string
     */
    public $authorizeScopeType;

    // 维权类型
    /**
     * @var string
     */
    public $protectRightsType;

    // 维权范围类型
    /**
     * @var string
     */
    public $protectRightsScopeType;

    // 内容授权开始日期
    /**
     * @var string
     */
    public $authorizationStartDate;

    // 内容授权时长
    /**
     * @var int
     */
    public $authorizationTimeLength;

    // 内容授权平台列表
    /**
     * @var string[]
     */
    public $authPlatform;

    // 客户端token，幂等号，用来保证并发请求幂等性
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'fileId'                  => 'file_id',
        'title'                   => 'title',
        'type'                    => 'type',
        'keywords'                => 'keywords',
        'description'             => 'description',
        'coverFileId'             => 'cover_file_id',
        'playListName'            => 'play_list_name',
        'authorizeType'           => 'authorize_type',
        'authorizeScopeType'      => 'authorize_scope_type',
        'protectRightsType'       => 'protect_rights_type',
        'protectRightsScopeType'  => 'protect_rights_scope_type',
        'authorizationStartDate'  => 'authorization_start_date',
        'authorizationTimeLength' => 'authorization_time_length',
        'authPlatform'            => 'auth_platform',
        'clientToken'             => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('playListName', $this->playListName, true);
        Model::validateRequired('authorizationStartDate', $this->authorizationStartDate, true);
        Model::validateRequired('authorizationTimeLength', $this->authorizationTimeLength, true);
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
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->keywords) {
            $res['keywords'] = $this->keywords;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->coverFileId) {
            $res['cover_file_id'] = $this->coverFileId;
        }
        if (null !== $this->playListName) {
            $res['play_list_name'] = $this->playListName;
        }
        if (null !== $this->authorizeType) {
            $res['authorize_type'] = $this->authorizeType;
        }
        if (null !== $this->authorizeScopeType) {
            $res['authorize_scope_type'] = $this->authorizeScopeType;
        }
        if (null !== $this->protectRightsType) {
            $res['protect_rights_type'] = $this->protectRightsType;
        }
        if (null !== $this->protectRightsScopeType) {
            $res['protect_rights_scope_type'] = $this->protectRightsScopeType;
        }
        if (null !== $this->authorizationStartDate) {
            $res['authorization_start_date'] = $this->authorizationStartDate;
        }
        if (null !== $this->authorizationTimeLength) {
            $res['authorization_time_length'] = $this->authorizationTimeLength;
        }
        if (null !== $this->authPlatform) {
            $res['auth_platform'] = $this->authPlatform;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddContentRequest
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
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['keywords'])) {
            if (!empty($map['keywords'])) {
                $model->keywords = $map['keywords'];
            }
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['cover_file_id'])) {
            $model->coverFileId = $map['cover_file_id'];
        }
        if (isset($map['play_list_name'])) {
            $model->playListName = $map['play_list_name'];
        }
        if (isset($map['authorize_type'])) {
            $model->authorizeType = $map['authorize_type'];
        }
        if (isset($map['authorize_scope_type'])) {
            $model->authorizeScopeType = $map['authorize_scope_type'];
        }
        if (isset($map['protect_rights_type'])) {
            $model->protectRightsType = $map['protect_rights_type'];
        }
        if (isset($map['protect_rights_scope_type'])) {
            $model->protectRightsScopeType = $map['protect_rights_scope_type'];
        }
        if (isset($map['authorization_start_date'])) {
            $model->authorizationStartDate = $map['authorization_start_date'];
        }
        if (isset($map['authorization_time_length'])) {
            $model->authorizationTimeLength = $map['authorization_time_length'];
        }
        if (isset($map['auth_platform'])) {
            if (!empty($map['auth_platform'])) {
                $model->authPlatform = $map['auth_platform'];
            }
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
