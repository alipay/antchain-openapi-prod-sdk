<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGTMNG\Models;

use AlibabaCloud\Tea\Model;

class GatewayMarketRichDetailVO extends Model
{
    // 市场条目 ID
    /**
     * @example 市场条目 ID
     *
     * @var int
     */
    public $id;

    // 资产类型（skill / package / agent / workflow / tool / card / mcp）
    /**
     * @example 资产类型（skill / package / agent / workflow / tool / card / mcp）
     *
     * @var string
     */
    public $type;

    // 名称
    /**
     * @example 名称
     *
     * @var string
     */
    public $name;

    // 描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $description;

    // ref_id
    /**
     * @example ref_id
     *
     * @var int
     */
    public $refId;

    // tags
    /**
     * @example tags
     *
     * @var string[]
     */
    public $tags;

    // labels
    /**
     * @example labels
     *
     * @var string[]
     */
    public $labels;

    // creator
    /**
     * @example creator
     *
     * @var string
     */
    public $creator;

    // download_count
    /**
     * @example download_count
     *
     * @var int
     */
    public $downloadCount;

    // view_count
    /**
     * @example view_count
     *
     * @var int
     */
    public $viewCount;

    // subscription_count
    /**
     * @example subscription_count
     *
     * @var int
     */
    public $subscriptionCount;

    // recommend_flag
    /**
     * @example recommend_flag
     *
     * @var bool
     */
    public $recommendFlag;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // subscription_status
    /**
     * @example subscription_status
     *
     * @var string
     */
    public $subscriptionStatus;

    // channels
    /**
     * @example channels
     *
     * @var string
     */
    public $channels;

    // downloadable
    /**
     * @example downloadable
     *
     * @var bool
     */
    public $downloadable;

    // gmt_create
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;

    // version
    /**
     * @example version
     *
     * @var string
     */
    public $version;

    // source
    /**
     * @example source
     *
     * @var string
     */
    public $source;

    // meta
    /**
     * @example meta
     *
     * @var string
     */
    public $meta;

    // ext
    /**
     * @example ext
     *
     * @var string
     */
    public $ext;

    // modifier
    /**
     * @example modifier
     *
     * @var string
     */
    public $modifier;

    // download_url
    /**
     * @example download_url
     *
     * @var string
     */
    public $downloadUrl;

    // ext_parsed
    /**
     * @example ext_parsed
     *
     * @var string
     */
    public $extParsed;
    protected $_name = [
        'id'                 => 'id',
        'type'               => 'type',
        'name'               => 'name',
        'description'        => 'description',
        'refId'              => 'ref_id',
        'tags'               => 'tags',
        'labels'             => 'labels',
        'creator'            => 'creator',
        'downloadCount'      => 'download_count',
        'viewCount'          => 'view_count',
        'subscriptionCount'  => 'subscription_count',
        'recommendFlag'      => 'recommend_flag',
        'status'             => 'status',
        'subscriptionStatus' => 'subscription_status',
        'channels'           => 'channels',
        'downloadable'       => 'downloadable',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'version'            => 'version',
        'source'             => 'source',
        'meta'               => 'meta',
        'ext'                => 'ext',
        'modifier'           => 'modifier',
        'downloadUrl'        => 'download_url',
        'extParsed'          => 'ext_parsed',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->refId) {
            $res['ref_id'] = $this->refId;
        }
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }
        if (null !== $this->labels) {
            $res['labels'] = $this->labels;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->downloadCount) {
            $res['download_count'] = $this->downloadCount;
        }
        if (null !== $this->viewCount) {
            $res['view_count'] = $this->viewCount;
        }
        if (null !== $this->subscriptionCount) {
            $res['subscription_count'] = $this->subscriptionCount;
        }
        if (null !== $this->recommendFlag) {
            $res['recommend_flag'] = $this->recommendFlag;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subscriptionStatus) {
            $res['subscription_status'] = $this->subscriptionStatus;
        }
        if (null !== $this->channels) {
            $res['channels'] = $this->channels;
        }
        if (null !== $this->downloadable) {
            $res['downloadable'] = $this->downloadable;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->meta) {
            $res['meta'] = $this->meta;
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->extParsed) {
            $res['ext_parsed'] = $this->extParsed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GatewayMarketRichDetailVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['ref_id'])) {
            $model->refId = $map['ref_id'];
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = $map['tags'];
            }
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = $map['labels'];
            }
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['download_count'])) {
            $model->downloadCount = $map['download_count'];
        }
        if (isset($map['view_count'])) {
            $model->viewCount = $map['view_count'];
        }
        if (isset($map['subscription_count'])) {
            $model->subscriptionCount = $map['subscription_count'];
        }
        if (isset($map['recommend_flag'])) {
            $model->recommendFlag = $map['recommend_flag'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['subscription_status'])) {
            $model->subscriptionStatus = $map['subscription_status'];
        }
        if (isset($map['channels'])) {
            $model->channels = $map['channels'];
        }
        if (isset($map['downloadable'])) {
            $model->downloadable = $map['downloadable'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['meta'])) {
            $model->meta = $map['meta'];
        }
        if (isset($map['ext'])) {
            $model->ext = $map['ext'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['ext_parsed'])) {
            $model->extParsed = $map['ext_parsed'];
        }

        return $model;
    }
}
