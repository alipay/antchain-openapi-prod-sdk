<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskGoRequest extends Model
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

    // 风险类型。枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
    /**
     * @var string
     */
    public $riskType;

    // 调用行业，枚举值：
    // insurance 保险；retail 零售；finance 金融行业；logistics 物流行业；city_services 城市服务；medical 医疗服务；digital_media 数媒行业；recycle 回收行业；payment 缴费行业；vehicle 汽车；travel 旅游；air_travel 航旅行业；FMCG 快消零售；education 教育行业；fashion_retail 时尚零售；game_industry 文体行业；rental 租赁；advertisement 广告行业；restaurants 餐饮行业；ticket 票务行业；complexes 综合体行业
    /**
     * @var string
     */
    public $businessCode;

    // 风险咨询对应的自身业务场景/环节，枚举值：
    // register 注册；order 下单；payment 支付；login 登录；offline_query 离线查询；inquery 查询；reserve 预约；invitation 邀请；other 其他
    /**
     * @var string
     */
    public $scene;

    // 支付宝用户 2088 账号
    /**
     * @var string
     */
    public $userId;

    // 支付宝用户 open_id 账号。需要注意，user_id 和 open_id 不可同时为空，同时传入时，以 user_id 为准
    /**
     * @var string
     */
    public $openId;

    // 支付宝商家 pid，如果风险咨询对象是支付宝商家，则填写pid
    /**
     * @var string
     */
    public $merPid;

    // 手机号码，用于直接输入风险咨询对象的手机号码
    /**
     * @var string
     */
    public $mobileNo;

    // 身份证号码
    /**
     * @var string
     */
    public $certNo;

    // 账户登录 ip
    /**
     * @var string
     */
    public $ip;

    // 地理位置，用于输入用户产生交易时的地理位置信息
    /**
     * @var string
     */
    public $lbs;

    // 咨询方类型，填写风险咨询中对应的商户或服务商对于蚂蚁的类型。枚举值：direct_isv 直连服务商；indirect_isv 间连服务商；unconn_isv 无关服务商；direct_mer 直连商户；indirect_mer 间连商户；unconn_mer 无关联商户；unknown 其他
    /**
     * @var string
     */
    public $role;

    // 可填入活动id唯一值，或其他活动信息
    /**
     * @var string
     */
    public $activityInfo;

    // 营销抢购风险识别入参模型
    /**
     * @var PurchaseQueryModel
     */
    public $purchaseQueryModel;

    // 行业黄牛风险识别入参模型
    /**
     * @var ScalperQueryModel
     */
    public $scalperQueryModel;

    // 营销发奖风险识别入参模型
    /**
     * @var AwardingQueryModel
     */
    public $awardingQueryModel;

    // 行业刷单风险识别入参模型
    /**
     * @var FarmingQueryModel
     */
    public $farmingQueryModel;

    // 行业履约风险识别入参模型
    /**
     * @var BaddebtQueryModel
     */
    public $baddebtQueryModel;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'riskType'           => 'risk_type',
        'businessCode'       => 'business_code',
        'scene'              => 'scene',
        'userId'             => 'user_id',
        'openId'             => 'open_id',
        'merPid'             => 'mer_pid',
        'mobileNo'           => 'mobile_no',
        'certNo'             => 'cert_no',
        'ip'                 => 'ip',
        'lbs'                => 'lbs',
        'role'               => 'role',
        'activityInfo'       => 'activity_info',
        'purchaseQueryModel' => 'purchase_query_model',
        'scalperQueryModel'  => 'scalper_query_model',
        'awardingQueryModel' => 'awarding_query_model',
        'farmingQueryModel'  => 'farming_query_model',
        'baddebtQueryModel'  => 'baddebt_query_model',
    ];

    public function validate()
    {
        Model::validateRequired('riskType', $this->riskType, true);
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateMaxLength('riskType', $this->riskType, 50);
        Model::validateMaxLength('businessCode', $this->businessCode, 30);
        Model::validateMaxLength('scene', $this->scene, 50);
        Model::validateMaxLength('userId', $this->userId, 50);
        Model::validateMaxLength('openId', $this->openId, 128);
        Model::validateMaxLength('merPid', $this->merPid, 50);
        Model::validateMaxLength('mobileNo', $this->mobileNo, 50);
        Model::validateMaxLength('certNo', $this->certNo, 50);
        Model::validateMaxLength('ip', $this->ip, 32);
        Model::validateMaxLength('lbs', $this->lbs, 50);
        Model::validateMaxLength('role', $this->role, 128);
        Model::validateMaxLength('activityInfo', $this->activityInfo, 100);
        Model::validateMinLength('riskType', $this->riskType, 1);
        Model::validateMinLength('businessCode', $this->businessCode, 1);
        Model::validateMinLength('scene', $this->scene, 1);
        Model::validateMinLength('userId', $this->userId, 1);
        Model::validateMinLength('openId', $this->openId, 1);
        Model::validateMinLength('merPid', $this->merPid, 1);
        Model::validateMinLength('mobileNo', $this->mobileNo, 1);
        Model::validateMinLength('certNo', $this->certNo, 1);
        Model::validateMinLength('ip', $this->ip, 1);
        Model::validateMinLength('lbs', $this->lbs, 1);
        Model::validateMinLength('role', $this->role, 1);
        Model::validateMinLength('activityInfo', $this->activityInfo, 1);
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
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->merPid) {
            $res['mer_pid'] = $this->merPid;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->lbs) {
            $res['lbs'] = $this->lbs;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->activityInfo) {
            $res['activity_info'] = $this->activityInfo;
        }
        if (null !== $this->purchaseQueryModel) {
            $res['purchase_query_model'] = null !== $this->purchaseQueryModel ? $this->purchaseQueryModel->toMap() : null;
        }
        if (null !== $this->scalperQueryModel) {
            $res['scalper_query_model'] = null !== $this->scalperQueryModel ? $this->scalperQueryModel->toMap() : null;
        }
        if (null !== $this->awardingQueryModel) {
            $res['awarding_query_model'] = null !== $this->awardingQueryModel ? $this->awardingQueryModel->toMap() : null;
        }
        if (null !== $this->farmingQueryModel) {
            $res['farming_query_model'] = null !== $this->farmingQueryModel ? $this->farmingQueryModel->toMap() : null;
        }
        if (null !== $this->baddebtQueryModel) {
            $res['baddebt_query_model'] = null !== $this->baddebtQueryModel ? $this->baddebtQueryModel->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskGoRequest
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
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['mer_pid'])) {
            $model->merPid = $map['mer_pid'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['lbs'])) {
            $model->lbs = $map['lbs'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['activity_info'])) {
            $model->activityInfo = $map['activity_info'];
        }
        if (isset($map['purchase_query_model'])) {
            $model->purchaseQueryModel = PurchaseQueryModel::fromMap($map['purchase_query_model']);
        }
        if (isset($map['scalper_query_model'])) {
            $model->scalperQueryModel = ScalperQueryModel::fromMap($map['scalper_query_model']);
        }
        if (isset($map['awarding_query_model'])) {
            $model->awardingQueryModel = AwardingQueryModel::fromMap($map['awarding_query_model']);
        }
        if (isset($map['farming_query_model'])) {
            $model->farmingQueryModel = FarmingQueryModel::fromMap($map['farming_query_model']);
        }
        if (isset($map['baddebt_query_model'])) {
            $model->baddebtQueryModel = BaddebtQueryModel::fromMap($map['baddebt_query_model']);
        }

        return $model;
    }
}
